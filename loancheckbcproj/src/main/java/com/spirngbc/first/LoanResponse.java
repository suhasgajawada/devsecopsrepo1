package com.spirngbc.first;

public class LoanResponse {

	int approvedLoanAmount;
	int status;
	
	public LoanResponse() {
		// TODO Auto-generated constructor stub
	}

	public int getApprovedLoanAmount() {
		return approvedLoanAmount;
	}

	public void setApprovedLoanAmount(int approvedLoanAmount) {
		this.approvedLoanAmount = approvedLoanAmount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public LoanResponse(int approvedLoanAmount, int status) {
		super();
		this.approvedLoanAmount = approvedLoanAmount;
		this.status = status;
	}
	
}
