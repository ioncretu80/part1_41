public class CheckUnderAge implements StudentChecks{
    @Override
    public boolean check(Student student) {
        return student.getAge()<30;
    }
}
