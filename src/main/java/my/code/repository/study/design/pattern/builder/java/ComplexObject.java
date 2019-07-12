package my.code.repository.study.design.pattern.builder.java;

/**
 * @author Djh on 2018/7/27 15:25
 * E-Mail ：1544579459@qq.com
 */
public class ComplexObject {

    private int mAge;
    private String mSex;
    private String mName;
    private String mFatherName;

    private ComplexObject(Builder builder) {
        mSex = builder.mSex;
        mAge = builder.mAge;
        mName = builder.mName;
        mFatherName = builder.mFatherName;
    }

    public static class Builder {
        private int mAge;
        private String mSex;
        private String mName;
        private String mFatherName;

        public Builder setName(String name) {
            mName = name;
            return this;
        }

        public Builder setAge(int age) {
            mAge = age;
            return this;
        }

        public Builder setSex(String sex) {
            mSex = sex;
            return this;
        }

        public Builder setFatherName(String fatherName) {
            mFatherName = fatherName;
            return this;
        }

        public ComplexObject build() {
            return new ComplexObject(this);
        }
    }
}
