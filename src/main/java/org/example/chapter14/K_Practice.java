package org.example.chapter14;

// == 직원 관리 시스템 == //

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 직원 데이터 정의
@AllArgsConstructor // @Setter 역할
@Getter
@ToString
class Employee {
    private String department; // 부서
    private String name; // 직원명
    private int salary; // 급여
}


public class K_Practice {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("IT", "이승아", 300),
                new Employee("HR", "조승범", 500),
                new Employee("IT", "김준일", 400),
                new Employee("OP", "전예찬", 350),
                new Employee("HR", "윤대휘", 380)
        );

        // 1. 급여가 400 이상인 직원 '필터링'
        // : filter() - 조건을 검사해서 true인 요소만을 다시 반환
        List<Employee> filterSalary = employees.stream()
                .filter(employee -> employee.getSalary() >= 400)
                .collect(Collectors.toList());

        filterSalary.forEach(System.out::println);
        System.out.println();

        // 2. IT 부서 직원의 이름만 추출
        // 1) 부서(department)가 'IT'인 직원을 필터링 - filter
        // 2) 부서가 'IT'인 직원 목록을 전체 순회하여 이름만 추출 - map
        List<String> filterDepartment = employees.stream()
                // e -> "IT".equals(e.getDepartment)
                .filter(employee -> employee.getDepartment().equals("IT"))
                .map(employee -> employee.getName())
                .collect(Collectors.toList());

        filterDepartment.forEach(System.out::println);
        // System.out.println(filterDepartment);
        System.out.println();

        // 3. 특정 부서(HR) 직원 중 이름에 '조'가 포함된 직원 필터링
        // 1) 부서가 'HR'인 직원을 필터링 >> equals
        // 2) 위의 목록 중 이름에 '조'가 포함된 직원을 필터링 >> contains
        List<Employee> filterWithJo = employees.stream()
                .filter(employee -> employee.getDepartment().equals("HR"))
                .filter(employee -> employee.getName().contains("조"))
                .collect(Collectors.toList());

        filterWithJo.forEach(System.out::println);
        // filterWithJo.forEach(e -> System.out.println(e.getName())); // 조승범
        System.out.println();

        // 4. 부서별 직원 그룹화
        // Collectors 클래스 - groupingBy
        Map<String, List<Employee>> group = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        group.forEach((String, list) -> {
            System.out.println(String + "부서: " + list);
        });
        for (Map.Entry<String, List<Employee>> entry: group.entrySet()) {
            String department = entry.getKey();
            List<Employee> employeesInDept = entry.getValue();

            System.out.println(department + ": ");
            for (Employee employee: employeesInDept) {
                System.out.println(employee.getName() + " ");
            }
        }
        group.forEach((department, employeesInDept) -> {
            String name = employeesInDept.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(" "));
        });

        // 5. 부서별(그룹화) 평균 급여 계산
        // Collectors 클래스 - groupingBy
        //                  - averaging 타입: 해당 타입의 평균을 계산 (averagingInt(각 직원의 급여 전달))
        Map<String, Double> avg = employees.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment, Collectors.averagingInt(Employee::getSalary)));
        System.out.println(avg);
    }
}
