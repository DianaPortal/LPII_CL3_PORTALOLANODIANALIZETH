package com.bd.basico.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TBL_PRODUCTOCL3")
public class TBL_PRODUCTOCL3 {
	@Id

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int IDPRODUCTOCL3;
	private String NOMBRECL3;
	private double PRECIOVENTACL3;
	private int STOCK;
	private double PRECIOCOMPCL3;
	private String ESTADOCL3;
	private String DESCRIPCL3;
	public int getIDPRODUCTOCL3() {
		return IDPRODUCTOCL3;
	}
	public void setIDPRODUCTOCL3(int iDPRODUCTOCL3) {
		IDPRODUCTOCL3 = iDPRODUCTOCL3;
	}
	public String getNOMBRECL3() {
		return NOMBRECL3;
	}
	public void setNOMBRECL3(String nOMBRECL3) {
		NOMBRECL3 = nOMBRECL3;
	}
	public double getPRECIOVENTACL3() {
		return PRECIOVENTACL3;
	}
	public void setPRECIOVENTACL3(double pRECIOVENTACL3) {
		PRECIOVENTACL3 = pRECIOVENTACL3;
	}
	public int getSTOCK() {
		return STOCK;
	}
	public void setSTOCK(int sTOCK) {
		STOCK = sTOCK;
	}
	public double getPRECIOCOMPCL3() {
		return PRECIOCOMPCL3;
	}
	public void setPRECIOCOMPCL3(double pRECIOCOMPCL3) {
		PRECIOCOMPCL3 = pRECIOCOMPCL3;
	}
	public String getESTADOCL3() {
		return ESTADOCL3;
	}
	public void setESTADOCL3(String eSTADOCL3) {
		ESTADOCL3 = eSTADOCL3;
	}
	public String getDESCRIPCL3() {
		return DESCRIPCL3;
	}
	public void setDESCRIPCL3(String dESCRIPCL3) {
		DESCRIPCL3 = dESCRIPCL3;
	}
	@Override
	public String toString() {
		return "TBL_PRODUCTOCL3 [IDPRODUCTOCL3=" + IDPRODUCTOCL3 + ", NOMBRECL3=" + NOMBRECL3 + ", PRECIOVENTACL3="
				+ PRECIOVENTACL3 + ", STOCK=" + STOCK + ", PRECIOCOMPCL3=" + PRECIOCOMPCL3 + ", ESTADOCL3=" + ESTADOCL3
				+ ", DESCRIPCL3=" + DESCRIPCL3 + "]";
	}// fin del metodo tostring
	
	

}
