

		
		public class B extends A {
			private int a = 222;
			 
			    public static void main(String[] args) {
			        System.out.println("in main(): ");
			        System.out.println("a = "+a );
			        a = 123;
			    }
			}
			public class A {
			    private int a = 100;
			    public void setA( int value) {
			        a = value;
			}
			    public int getA() {
			        return a;
			    }
			} //class A
	}


