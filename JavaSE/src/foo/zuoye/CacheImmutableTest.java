package foo.zuoye;

class CacheImmutable{
	private final String name;
	private static final int MAX_NUM = 10;
	private static int pos = 0;
	public static CacheImmutable[] cache = new CacheImmutable[MAX_NUM];
	
	
	// 使用private创建，不可变类通过valueOf()创建
	private CacheImmutable(String name) {
		this.name = name;
}
	public String getName() {
		return this.name;
	}
	
	public static CacheImmutable valueOf(String name) {
	// 如果缓存中存在该对象，直接返回
		for(int i = 0;i < MAX_NUM;i++) {
//			cache[i] != null && 
			if(cache[i].getName().equals(name)) {
				return cache[i];
			}
		}
	// 如果缓存池中没有满，则缓存，如果满，则替代第一个
		if(pos < MAX_NUM) {
			cache[pos] = new CacheImmutable(name);
			pos++;
		}else {
			cache[0] = new CacheImmutable(name);
			pos = 1;
		}
		return cache[pos-1];
	}
	// 重写equals方法和hashcode方法
	public boolean equals(Object obj) {
		// 如果是同一个对象，则真
		if(obj == this) {
			return true;
		}else {
	// 如果不是同一个对象，通过比较name
			if(obj != null && obj.getClass() == getClass()) {
				if(obj.getClass().getName().equals(name)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public int hashCode() {
	// equals比较相等的必须用hashcode比较也相等
		return name.hashCode();
	}
}
	
public class CacheImmutableTest {
	public static void main(String[] args) {
		CacheImmutable c1 = CacheImmutable.valueOf("zhili");
		CacheImmutable c2 = CacheImmutable.valueOf("zhili");
		System.out.println(c1 == c2);
	}
}
