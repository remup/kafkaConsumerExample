package com.example.remya.kafka.kafkaConsumerExample;

public class Employee {
	private String name;
    private String dept;
    private Long salary;
	public Employee(String name, String dept, Long salary) {
		
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public Long getSalary() {
		return salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dept='").append(dept).append('\'');
        sb.append(", salary='").append(salary).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
