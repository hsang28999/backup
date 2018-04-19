/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author hsang
 */
public class TacGia  implements Serializable{
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private String butDanh;
    private String diaChi;

    public TacGia() {
    }

    public TacGia(String ten, int tuoi, String gioiTinh, String butDanh, String diaChi) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.butDanh = butDanh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getButDanh() {
        return butDanh;
    }

    public void setButDanh(String butDanh) {
        this.butDanh = butDanh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}
