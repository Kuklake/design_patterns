package pl.sda.java.designPatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HeadDepartment implements Department {

    private int id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    @Override
    public String getDepartmentNames() {
        List<String> childDepartmentNames = this.childDepartments.stream()
                .flatMap(d -> Stream.of(d.getDepartmentNames()))
                .collect(Collectors.toList());

        return String.join(",", childDepartmentNames);
    }
}
