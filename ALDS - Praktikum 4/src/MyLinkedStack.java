class Entry {
	public Entry next;
	public Object data;

	Entry() {
		this.data = null;
		this.next = null;
	}
}

public class MyLinkedStack {

	private Entry head;
	private int size;

	public MyLinkedStack() {
		this.head = null;
		this.size = 0;
	}

	public boolean empty() {
		if (this.size != 0)
			return false;
		else
			return true;
	}

	public boolean push(Object o) {
		if (o != null) {
			Entry e = new Entry();
			e.data = o;
			if (this.head != null) {
				e.next = this.head;
			}
			this.head = e;
			this.size++;
			return true;
		} else
			return false;
	}

	public Object pop() {
		Object result = peek();

		if (this.head != null) {
			this.head = this.head.next;
			this.size--;
		}
		return result;
	}

	public Object peek() {
		if (this.head != null) {
			return this.head.data;
		} else
			return null;
	}

	public int search(Object o) {
		if (o != null) {
			if (this.size > 0) {
				Entry e = this.head;
				if (e != null)
					for (int i = 0; i < this.size; i++) {
						if (e.data.equals(o))
							return i;
						if (e.next != null)
							e = e.next;
					}
			}
		}
		return -1;
	}

	public int size() {
		return this.size;
	}

}
