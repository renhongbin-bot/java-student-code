package api.clone;

import string.StringJoiner;

public class User implements Cloneable{
    int id;
    String username;
    String password;
    String path;
    int[] arr;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] arr) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.arr = arr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
    public String toString() {
        return "角色编号:" + id + ",用户名:" + username + ", 密码:" + password + ", 游戏图片:" + path + ",进度:" + arrString();
    }
    public String arrString() {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {

           if(i == arr.length - 1) {
               str += arr[i]+"]";
           } else {
               str += (arr[i]+",");
           }
        }
        return str;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        int[] arr = this.arr;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }
//        调用父类clone
        User u = (User) super.clone();
//        因为父亲克隆方法是浅克隆,所以需要替换克隆出来对象的地址值
        u.arr = newArr;
        return  u;
    }
}
