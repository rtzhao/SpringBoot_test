package fun.rtzhao.service;

import com.alibaba.dubbo.config.annotation.Service;
import fun.rtzhao.mapper.StudentMapper;
import fun.rtzhao.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //暴露接口给spring容器管理
@Service(interfaceClass = StudentService.class,version = "1.0.0",timeout = 15000) //dubbo注解
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;


    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }
}
