CREATE DATABASE SOF203_CHUAN_HOA;

GO
USE SOF203_CHUAN_HOA;
GO

CREATE TABLE sinh_vien
(
    id bigint IDENTITY(0,1) NOT NULL,
    ma_sinh_vien varchar(20) NULL,
    ten_sinh_vien nvarchar(50) NULL,
    tuoi int NULL,
    ky_hoc int NULL,
    nganh_hoc nvarchar(100) NULL,
    diem_trung_binh float NULL,
    gioi_tinh bit NULL,
    CONSTRAINT sinh_vien_PK PRIMARY KEY (id)
);
GO
INSERT INTO sinh_vien
    ( ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc, nganh_hoc, diem_trung_binh,gioi_tinh)
VALUES( N'HE130461', N'Nguyễn Thuý Hằng', 10, 6, N'Kỹ Thuật Phần Mềm', 9.9, 0);
INSERT INTO sinh_vien
    ( ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc, nganh_hoc, diem_trung_binh,gioi_tinh)
VALUES( N'HE130465', N'Nguyễn Hoàng Tiến', 11, 13, N'Phát Triển Phầm Mềm', 8.7, 1);
INSERT INTO sinh_vien
    ( ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc, nganh_hoc, diem_trung_binh,gioi_tinh)
VALUES( N'HE130487', N'Trần Tuấn Phong', 15, 18, N'Xử Lý Dữ Liệu', 5.5, 1);
INSERT INTO sinh_vien
    ( ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc, nganh_hoc, diem_trung_binh,gioi_tinh)
VALUES( N'HE130765', N'Vũ Văn Nguyên', 13, 7, N'Ứng Dụng Phần Mềm', 10.0, 1);
INSERT INTO sinh_vien
    ( ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc, nganh_hoc, diem_trung_binh,gioi_tinh)
VALUES( N'HE130356', N'Phạm Gia Khánh', 14, 9, N'Kỹ Thuật Phần Mềm', 9.9, 1);
INSERT INTO sinh_vien
    ( ma_sinh_vien, ten_sinh_vien, tuoi, ky_hoc, nganh_hoc, diem_trung_binh,gioi_tinh)
VALUES(N'HE130462', N'Nguyễn Anh Dũng', 20, 11, N'Ứng Dụng Phần Mềm', 10.0, 1);
