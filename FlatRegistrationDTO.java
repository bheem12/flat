package com.cg.frs.dto;
public class FlatRegistrationDTO {
	private int flatRegNo,flatType,flatArea;
	private int rentAmount,depositAmount, ownerId;
	public int getFlatRegNo() {
		return flatRegNo;
	}
	public void setFlatRegNo(int flatRegNo) {
		this.flatRegNo = flatRegNo;
	}
	public int getFlatType() {
		return flatType;
	}
	public void setFlatType(int flatType) {
		this.flatType = flatType;
	}
	public int getFlatArea() {
		return flatArea;
	}
	public void setFlatArea(int flatArea) {
		this.flatArea = flatArea;
	}
	public int getRentAmount() {
		return rentAmount;
	}
	public void setRentAmount(int rentAmount) {
		this.rentAmount = rentAmount;
	}
	public int getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		this.depositAmount = depositAmount;
	}
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}
	public FlatRegistrationDTO(int flatRegNo, int flatType, int flatArea, int rentAmount, int depositAmount,
			int ownerId) {
		super();
		this.flatRegNo = flatRegNo;
		this.flatType = flatType;
		this.flatArea = flatArea;
		this.rentAmount = rentAmount;
		this.depositAmount = depositAmount;
		this.ownerId = ownerId;
	}
	public FlatRegistrationDTO() {
		// TODO Auto-generated constructor stub
	}
	
}