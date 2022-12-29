class LabeledLoop {
	public static void main(String[] args) {
		outer: for(int i=1; i<=5; i++) {
			System.out.println("Outer Loop");
			inner: for(int j=1; j<=5; j++) {
				System.out.println("Inner Loop");
				if(j==4)
					break outer;
			}
		}
	}
}
