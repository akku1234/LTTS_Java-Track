
class MethodLocalInnerDemo {
	
	private void getValue() {
		final int sum = 20;
	
		class MethodLocalInner {
			public int divisor;
			public int remainder;
			
			
			public MethodLocalInner()
            {
                divisor = 4;
                remainder = sum%divisor;
            }
			private int getDivisor()
            {
                return divisor;
            }
			private int getRemainder()
            {
                return remainder;
            }
			private int getQuotient()
            {
                System.out.println("Inside inner class");
                return sum / divisor;
            }
		}
		MethodLocalInner inner = new MethodLocalInner();
        System.out.println("Divisor = "+ inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLocalInnerDemo outer = new MethodLocalInnerDemo();	
        outer.getValue();

	}

}