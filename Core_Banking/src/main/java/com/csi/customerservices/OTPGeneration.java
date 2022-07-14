package com.csi.customerservices;

public class OTPGeneration {
	
	int generatedOTP ()
	{
		return (int) (Math.random()*900000+100000);
	}

}
