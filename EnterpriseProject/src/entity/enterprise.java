/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author hsang
 */


public class enterprise {
    int Id;
    String enterpriseName;
    long createdAt;
    String taxCode;
    int status;
    
    public static String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
    
    public enterprise(){
        Id = ThreadLocalRandom.current().nextInt(1000, 9999);
        taxCode = generateString();
        createdAt = System.currentTimeMillis() % 1000;
        status = 1;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
}
