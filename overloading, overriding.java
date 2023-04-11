class parent {
	void Parentmethod() {}
}

class Child extends Parent {
	void Parentmethod() {} //overriding
	void Parentmethod(int i) {} //overloading

	void Childmethod() {}
	void Childmethod(int i) {} //overloading
	void Childmethod() {} //alrady defined in child
}