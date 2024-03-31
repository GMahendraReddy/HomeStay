package homestaybooking;

public class RoomDetais implements RoomBillComponent{
	
//	private int Customername;
//	private int Typeofroom;
//	private int NoofExtrapersons;
//	private int NoofDaysofStay;
	static int billid =101;
	public static int getBillId(int billid) {
		 return billid;
	}
	public static String getCustomername(String Customername) {
		return Customername;
	}
	public static String getTypeofRoom(String Typeofroom) {
		return Typeofroom;	
	}
	public static int  getNoofExtrapersons(int NoofExtrapersons) {
		return NoofExtrapersons;	
	}
	public static int  getNoofDaysofStay(int NoofDaysofStay) {
		return NoofDaysofStay;	
	}
	public static boolean  ValidateNoofDaysofStay(int ValidNoofDaysofStay) {
		return false;
	}
	public static boolean  ValidateNoofExtrapersons(int ValidgetNoofExtrapersons) {
		if (getNoofExtrapersons(1) > 0 && getNoofExtrapersons(2)<= 2) {
			
		}
		else {
			System.out.println("More Than two persons are not allowed");
		}
		return false;
	}
	public static boolean  ValidategetTypeofRoom(int validagetTypeofRoom) {
		return false;
	}
	

	public static void main(String[] args) {
		
		ValidateNoofExtrapersons(billid);

	}

	@Override
	public float calculatebill(float totalbill) {
		double TAX = 12;
		double ExtraPersonCharge = 500.00;
		double food_charge = 800.00;
		return totalbill;
		
	}
//	@Override
//	public float calculatebill() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
