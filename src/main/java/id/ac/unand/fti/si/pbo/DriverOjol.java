
package id.ac.unand.fti.si.pbo;

public abstract class DriverOjol {
    private String nama;
    private String noPlatMotor;
    private Integer saldo;
    private Integer status;

    public DriverOjol(String nama, String noPlatMotor) {
        this.nama = nama;
        this.noPlatMotor = noPlatMotor;
    }

    public DriverOjol(String nama, String noPlatMotor, Integer saldo) {
        this.nama = nama;
        this.noPlatMotor = noPlatMotor;
        this.saldo = 0;
        this.topUp(saldo);
    }

    public String getNama() {
        return nama;
    }

    public String getNoPlatMotor() {
        return noPlatMotor;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void topUp(Integer saldo) {
        if(saldo > 0)
            this.saldo = saldo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        if (status >=0 && status<= 2)
            this.status = status;
    }


    public abstract Integer hitungTarif(Integer jarak, Boolean macet);
    
}
