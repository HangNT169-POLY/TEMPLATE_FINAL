/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.model;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    private Long id;
    private String maSinhVien;
    private String tenSinhVien;
    private Integer tuoi;
    private Integer kyHoc;
    private String nganhHoc;
    private Float diemTrungBinh;
    private Boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(Long id, String maSinhVien, String tenSinhVien, Integer tuoi, Integer kyHoc, String nganhHoc, Float diemTrungBinh, Boolean gioiTinh) {
        this.id = id;
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoi = tuoi;
        this.kyHoc = kyHoc;
        this.nganhHoc = nganhHoc;
        this.diemTrungBinh = diemTrungBinh;
        this.gioiTinh = gioiTinh;
    }

    public SinhVien(String maSinhVien, String tenSinhVien, Integer tuoi, Integer kyHoc, String nganhHoc, Float diemTrungBinh, Boolean gioiTinh) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.tuoi = tuoi;
        this.kyHoc = kyHoc;
        this.nganhHoc = nganhHoc;
        this.diemTrungBinh = diemTrungBinh;
        this.gioiTinh = gioiTinh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public Integer getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(Integer kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public Float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Boolean getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", tuoi=" + tuoi + ", kyHoc=" + kyHoc + ", nganhHoc=" + nganhHoc + ", diemTrungBinh=" + diemTrungBinh + ", gioiTinh=" + gioiTinh + '}';
    }

}
