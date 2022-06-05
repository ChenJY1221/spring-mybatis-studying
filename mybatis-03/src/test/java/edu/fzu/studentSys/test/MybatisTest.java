package edu.fzu.studentSys.test;

import edu.fzu.studentSys.mapper.StudentMapper;
import edu.fzu.studentSys.pojo.Student;
import edu.fzu.studentSys.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MybatisTest {

    /*
    * 通过学生姓名或专业查询
    */
    @Test
    public void findStudentByNameOrMajorTest() {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.findStudentByNameOrMajor(null,null);
        for (Student student : students) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    /*
     *插入数据
     */
    @Test
    public void insertStudentTest() {

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        Student student = new Student(7, "小徐","计算机", "221900108");
        studentMapper.insertStudent(student);
        sqlSession.close();
    }

    /*
     *查找序号小于5的学生信息
     */
    @Test
    public void findIdLessThanFiveTest() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (Student student : mapper.findIdLessThanFive()) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}
