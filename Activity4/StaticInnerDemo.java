class StaticInnerDemo {
	static int sum = 20;
	
	
	static class StaticInner {
		public int divisor;
		public int remainder;
		
		
		public StaticInner()
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
            System.out.println("Inside static inner class");
            return sum / divisor;
        }
	
    

public static void main(String[] args) {
	StaticInner inner = new StaticInner();
	System.out.println("Divisor = "+ inner.getDivisor());
    System.out.println("Remainder = " + inner.getRemainder());
    System.out.println("Quotient = " + inner.getQuotient());

	}
}

}