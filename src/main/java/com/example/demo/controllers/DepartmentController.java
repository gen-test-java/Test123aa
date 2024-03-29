//package com.example.demo.controllers;
//
//import com.example.demo.entities.Department;
//import com.example.demo.repositories.DepartmentRepository;
//import com.example.demo.services.DepartmentService;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import java.util.List;
//import java.util.stream.Collectors;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
///**
// *
// * @author binod
// */
//@RestController
//@Transactional
//public class DepartmentController {
//    @Autowired
//    private DepartmentRepository departmentRepository;
//    @Autowired
//    private DepartmentService departmentService;
//
//    @GetMapping("/departments")
//    public ResponseEntity<?> getAllDepartments(){
//    return ResponseEntity.ok(departmentService.findAllDepartments());
//
//    }
//    @GetMapping("/departments/names")
//    public List<String> getAllDepartmentNames(){
//        System.out.println("list called");
//        return departmentRepository.findAll()
//                .stream()
//                .map(d->d.getDepartmentName())
//                .collect(Collectors.toList());
//    }
//    @ApiImplicitParams({
//         @ApiImplicitParam(name = "departmentId",required = false,value = "1"),
//         @ApiImplicitParam(name = "departmentName",required = true,value = "civil")
//    })
//
//
//     @PostMapping(value = "/departments")
//    public ResponseEntity<?> saveDepartment(@RequestBody Department department){
////         vehicleInfoValidator.validate(toSave, errors);
////            if (errors.hasErrors()) {
////                return new ResponseEntity<>(new ApiErrorResource(errors), HttpStatus.UNPROCESSABLE_ENTITY);
////            }
//        System.out.println("came with id"+department.getDepartmentId());
//        if(department.getDepartmentId()==null){
//        return ResponseEntity.ok(departmentRepository.save(department));
//        }else{
//            Department newDepartment=departmentRepository.findOne(department.getDepartmentId());
//            newDepartment.setDepartmentName(department.getDepartmentName());
//            return ResponseEntity.ok(newDepartment);
//
//        }
//    }
//    @DeleteMapping(value = "/departments")
//    public ResponseEntity<?> delete(@RequestParam Long departmentId){
//        System.out.println("delete called for id"+departmentId);
//        departmentRepository.delete(departmentId);
//        return ResponseEntity.ok("Deleted");
//    }
//
//}
