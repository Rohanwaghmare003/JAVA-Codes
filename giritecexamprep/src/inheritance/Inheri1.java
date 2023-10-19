package inheritance;


	
	class Circle
	{
		protected float radius;
		
		
		public void setRadius(float radius)
		{
			this.radius = radius;
		}
	}
		
		 class Area extends Circle
		{
			public float getArea()
			{
				return 3.14f*radius*radius;
			}
		}
			
			
		
		
		class Circumfer extends Circle
		{
			public float getCircum()
			{
				return 3.14f*2*radius;
			}
		}
	
	
		public class Inheri1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a = new Area();
		a.setRadius(5.0f);
		float result = a.getArea();
		System.out.println(result);
		
		Circumfer c = new Circumfer();
		c.setRadius(4);
		float result2 = c.getCircum();
		System.out.println(result2);
		
		c.getCircum();
		
		

	}

}
