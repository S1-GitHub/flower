package by.htp.flower.bean;

public class Bud {

	private Leaf leaves[];
	private String color;
	private int size;

	public Bud(int size) {
		this.size = size;
		this.color = "green";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public int getSize() {
		return size;
	}
		
		public void setSize(int size) {
			this.size=size;
	}
		public Leaf[] getLeaves() {
			return leaves;
		}
		
		public void addFreshLeaves() {
			if(leaves!=null) {
			}else { 
				leaves=new Leaf[3];
				
				leaves[0]=new Leaf("white", "ellipse");
				leaves[1]=new Leaf("white", "ellipse");
				leaves[2]=new Leaf("white", "ellipse");
			}
			
				}
		public void remoteLeaves() {
			if(leaves!=null) {
				leaves=null;
			}
			
			}
}
