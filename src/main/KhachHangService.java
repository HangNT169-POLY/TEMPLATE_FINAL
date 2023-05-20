package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bcuon
 */
public class KhachHangService {

    private final List<KhachHang> listKhachHang = new ArrayList<>();

    public List<KhachHang> fakeData() {
        listKhachHang.add(new KhachHang("M01", "Khách hàng A", 10, true, "Khách Thường"));
        listKhachHang.add(new KhachHang("M02", "Khách hàng B", 20, true, "Khách VIP"));
        listKhachHang.add(new KhachHang("M03", "Khách hàng C", 13, true, "Khách Thường"));
        listKhachHang.add(new KhachHang("M04", "Khách hàng D", 25, true, "Khách VVIP"));
        listKhachHang.add(new KhachHang("M05", "Khách hàng E", 15, true, "Khách VIP"));
        return listKhachHang;
    }

    public String removeKhachHang(int viTri) {
        return (viTri >= 0 && listKhachHang.remove(viTri) != null
                ? "Remove thành công!" : "Remove thất bại!");
    }

    public String addKhachHang(KhachHang khachHang) {
        return (khachHang != null && listKhachHang.add(khachHang)
                ? "Add thành công!" : "Add thất bại!");
    }

    public String updateKhachHang(int viTri, KhachHang khachHang) {
        if (viTri >= 0) {
            if (khachHang != null) {
                listKhachHang.set(viTri, khachHang);
                return "Update thành công!";
            }
            return "Vui lòng nhập thông tin khách hàng!";
        }
        return "Vui lòng nhập vị trí cần update!";
    }

    public String ghiFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try (FileOutputStream fos = new FileOutputStream(file);
                    ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                for (KhachHang khachHang : listKhachHang) {
                    oos.writeObject(khachHang);
                }
            }
            return "Ghi file thành công!";
        } catch (IOException e) {
            return "Ghi file thất bại";
        }
    }

    public String docFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                return "Không tìm thấy file!";
            }
            try (FileInputStream fis = new FileInputStream(file);
                    ObjectInputStream ois = new ObjectInputStream(fis)) {
                while (fis.available() > 0) {
                    listKhachHang.add((KhachHang) ois.readObject());
                }
            }
            return "Đọc file thành công!";
        } catch (IOException | ClassNotFoundException e) {
            return "Đọc file thất bại";
        }
    }
}
