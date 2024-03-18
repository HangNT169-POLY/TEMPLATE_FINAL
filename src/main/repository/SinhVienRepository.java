/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.repository;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.model.SinhVien;

/**
 *
 * @author hangnt
 */
public class SinhVienRepository {

    public List<SinhVien> getAll() {
        String query = """
                      SELECT id, ma_sinh_vien, ten_sinh_vien, tuoi, 
                             ky_hoc, nganh_hoc, diem_trung_binh, gioi_tinh
                      FROM sinh_vien;
                      """;

        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            List<SinhVien> lists = new ArrayList<>();
            while (rs.next()) {
                SinhVien sinhVien
                        = new SinhVien(rs.getLong(1),
                                rs.getString(2), rs.getString(3),
                                rs.getInt(4), rs.getInt(5), rs.getString(6),
                                rs.getFloat(7), rs.getBoolean(8));
                lists.add(sinhVien);
            }
            return lists;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public SinhVien getOne(Long id) {
        String query = """
                      SELECT id, ma_sinh_vien, ten_sinh_vien,
                             ky_hoc, nganh_hoc, diem_trung_binh, gioi_tinh
                      FROM sinh_vien
                      WHERE id = ? 
                      """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                SinhVien sinhVien
                        = new SinhVien(rs.getLong(1),
                                rs.getString(2), rs.getString(3),
                                rs.getInt(4), rs.getInt(5), rs.getString(6),
                                rs.getFloat(7), rs.getBoolean(8));
                return sinhVien;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(SinhVien sinhVien) {
        int check = 0;
        String query = """
                   INSERT INTO sinh_vien
                                (ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc,
                                    nganh_hoc, diem_trung_binh, gioi_tinh)
                                VALUES(?,?,?,?,?,?,?);
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sinhVien.getMaSinhVien());
            ps.setObject(2, sinhVien.getTenSinhVien());
            ps.setObject(3, sinhVien.getTuoi());
            ps.setObject(4, sinhVien.getKyHoc());
            ps.setObject(5, sinhVien.getNganhHoc());
            ps.setObject(6, sinhVien.getDiemTrungBinh());
            ps.setObject(7, sinhVien.getGioiTinh());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(Long id) {
        int check = 0;
        String query = """
                        DELETE FROM sinh_vien              
                        WHERE id = ?
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(SinhVien sinhVien, Long id) {
        int check = 0;
        String query = """
                        UPDATE sinh_vien
                            SET ma_sinh_vien = ?, 
                                ten_sinh_vien = ?,
                                tuoi = ?, ky_hoc = ?, 
                                nganh_hoc = ?, diem_trung_binh = ?,
                                gioi_tinh = ?
                        WHERE id = ?;
                     """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(query)) {
            ps.setObject(1, sinhVien.getMaSinhVien());
            ps.setObject(2, sinhVien.getTenSinhVien());
            ps.setObject(3, sinhVien.getTuoi());
            ps.setObject(4, sinhVien.getKyHoc());
            ps.setObject(5, sinhVien.getNganhHoc());
            ps.setObject(6, sinhVien.getDiemTrungBinh());
            ps.setObject(7, sinhVien.getGioiTinh());
            ps.setObject(8, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

}
