package Day1;

/**
 * 
 */
public class TypeConvertionDemo {

	public static void main(String[] args) {
		byte num1 = 127;
		int num2 = num1;
		
		int num3 = 257;   // num3%256(range of byte)
		byte num4 = (byte)num3;
		
		System.out.println(num4);

	}

}
