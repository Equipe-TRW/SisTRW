/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author informatica01
 */
public class modeloContasPagar {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_inclusao() {
        return data_inclusao;
    }

    public void setData_inclusao(Date data_inclusao) {
        this.data_inclusao = data_inclusao;
    }

    public String getTip_pag() {
        return tip_pag;
    }

    public void setTip_pag(String tip_pag) {
        this.tip_pag = tip_pag;
    }

    public int getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(int cod_barras) {
        this.cod_barras = cod_barras;
    }

    public int getFornec() {
        return fornec;
    }

    public void setFornec(int fornec) {
        this.fornec = fornec;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getData_venc() {
        return data_venc;
    }

    public void setData_venc(Date data_venc) {
        this.data_venc = data_venc;
    }

    public Date getData_paga() {
        return data_paga;
    }

    public void setData_paga(Date data_paga) {
        this.data_paga = data_paga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    int id;
    Date data_inclusao;
    String tip_pag;
    int cod_barras;
    int fornec;
    Float valor;
    Date data_venc;
    Date data_paga;
    String status;
    String desc;
}
