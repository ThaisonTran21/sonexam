package com.example.TranThaiSonPH47026;

import java.util.ArrayList;

public class NhanVienService {
    ArrayList<NhanVien> lstNhanVien = new ArrayList<>();

    public NhanVienService(){
        lstNhanVien.add(new NhanVien("NV001", "Son", 24, 10.0f, 5, "IT"));
    }

    public String update(NhanVien nhanVien){
        if (nhanVien.getMaNV().trim().isEmpty() || nhanVien.getTen().trim().isEmpty() || nhanVien.getTuoi() <=0 || nhanVien.getLuong() <=0 || nhanVien.getSoNamLamViec() <=0 || nhanVien.getPhongBan().trim().isEmpty()){
            throw new IllegalArgumentException("không được để trống các trường");
    }
        for (int i = 0; i<lstNhanVien.size(); i++){
            if (lstNhanVien.get(i).getMaNV().equalsIgnoreCase(nhanVien.getMaNV())){
                lstNhanVien.set(i, nhanVien);
                }
        }
        return "sửa thành công";
    }
}
