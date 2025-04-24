package com.example.TranThaiSonPH47026;

public class Phan1 {
        public int tinhTong(){
            int sum = 0;
            for (int i =1; i<=50; i++){
                if (i % 2==0 && i % 8 != 0){
                    sum +=i;
                }
            }
            return  sum;
        }

}
