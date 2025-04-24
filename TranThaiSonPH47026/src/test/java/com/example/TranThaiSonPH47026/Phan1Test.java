package com.example.TranThaiSonPH47026;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Phan1Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void tinhTong() {
        Phan1 tinhTong = new Phan1();
        int exp = 482;
        assertEquals(exp, tinhTong.tinhTong());
    }

    @Test
    void tinhTong2() {
        Phan1 tinhTong = new Phan1();
        int tong = tinhTong.tinhTong();
        assert (tong >=2);
    }

    @Test
    void tinhTong3() {
        Phan1 tinhTong = new Phan1();
        int tong = tinhTong.tinhTong();
        assert (tong >=50);
    }

    @Test
    void tinhTong4() {
        Phan1 tinhTong = new Phan1();
        int tong = tinhTong.tinhTong();
        assert (tong != 625);
    }

    @Test
    void tinhTong5() {
    }

}