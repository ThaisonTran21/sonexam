package com.example.TranThaiSonPH47026;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NhanVienServiceTest {
    NhanVienService nhanVienService = new NhanVienService();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void updateHopLe() {
        String exp = "sửa thành công";
        NhanVien nhanVien = new NhanVien("NV001", "SON", 23, 10.0f, 5, "IT");
        String act = nhanVienService.update(nhanVien);
        Assertions.assertEquals(exp,act);
    }

    @Test
    void updateMaTrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            nhanVienService.update(new NhanVien("", "SON", 23, 10.0f, 5, "IT"));
        });
    }

    @Test
    void updateTenTrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            nhanVienService.update(new NhanVien("NV001", " ", 23, 10.0f, 5, "IT"));
        });
    }

    @Test
    void updatePhongBanTrong() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            nhanVienService.update(new NhanVien("NV001", "SON", 23, 10.0f, 5, ""));
        });
    }

    @Test
    void updateTuoiBang0() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            nhanVienService.update(new NhanVien("NV001", "SON", 0, 10.0f, 5, "IT"));
        });
    }
}
