package com.swtao.chap01;

public class FilteringApples {
    public static class Apple{
        int weight = 0;
        String color = "";

        public int getWeight() {return weight;}

        public void setWeight(int weight) {this.weight = weight;}

        public String getColor() {return color;}

        public void setColor(String color) {this.color = color;}

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight=%d}", color, weight); // 格式化输出 string(color)入'%s' int(weight)填入'%d'
        }

    }
}
