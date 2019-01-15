package org.practice.designPattern.behavior.ch16iterator;

import org.practice.designPattern.behavior.ch16iterator.runoob.Iterator;
import org.practice.designPattern.behavior.ch16iterator.runoob.NameRepository;

/**
 * @author yoong
 * <br>
 * @desc 迭代器模式
 * http://www.runoob.com/design-pattern/iterator-pattern.html
 * <br>
 * @date 2019/1/15 14:14
 */
public class App {

    /**
     * 入口函数
     *
     * @param args
     */
    public static void main(String[] args) {
        try {
            iterator_runoob();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void iterator_runoob() {
        NameRepository nameRepository = new NameRepository();
        Iterator iterator = nameRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
