package com.wrapperclass;

class CheckingData {
	public static void main(String[] argh) {
		byte ch = Byte.parseByte(argh[0]);
		try {

			switch (ch) {
			case 1:
				System.out.println(Byte.parseByte(argh[1]));
				break;
			case 2:  
				Integer inte = new Integer(argh[1]);
				System.out.println(inte);
				break;
			case 3:
				System.out.println(Long.parseLong(argh[1]));
				break;
			case 4:
				System.out.println(Boolean.parseBoolean(argh[1]));
				break;
			case 5:
				System.out.println(argh[1].toCharArray());
			}
		} catch (Exception e) {
			System.out.println(" cant not be converted");
		}

	}
}
