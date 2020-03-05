package cn.itheima.demo09.Filter;

import java.io.File;
import java.io.FileFilter;

//创建过滤器的实现类，重写accept方法，自定义过滤规则
public class FileFilterImpl implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
