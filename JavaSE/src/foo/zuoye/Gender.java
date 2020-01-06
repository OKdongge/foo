package foo.zuoye;

public enum Gender {
	MALE("男"),FEMALE("女");
	private String name;
	private Gender(String name) {
		this.name = name;
	}
	
//	public void setName(String name) {
//		// 保证良好的封装性
//		switch(this) {
//			case MALE:
//				if (name.equals("男")) {
//					this.name = name;
//				}else {
//					System.out.println("参数错误");
//					return;
//				}
//				break;
//			case FEMALE:
//				if(name.equals("女")) {
//					this.name = name;
//				}else {
//					System.out.println("参数错误");
//					return;
//				}
//				break;
//		}
//	}
	
	public String getName() {
		return name;
	}
}
