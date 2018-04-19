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
public class Sach  implements Serializable{
    private String tieuDe;
    private String loaiSach;
    private String tacGia;
    private int namSanXuat;
    private String nxb;

    public Sach() {
    }

    public Sach(String tieuDe, String loaiSach, String tacGia, int namSanXuat, String nxb) {
        this.tieuDe = tieuDe;
        this.loaiSach = loaiSach;
        this.tacGia = tacGia;
        this.namSanXuat = namSanXuat;
        this.nxb = nxb;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getLoaiSach() {
        return loaiSach;
    }

    public void setLoaiSach(String loaiSach) {
        this.loaiSach = loaiSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }
    
    
}
