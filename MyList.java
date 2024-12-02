package com.toplab.task2.mylist;

/**
 * 此接口为官方的List接口改编，作为新生考核作业
 * 实现接口，重写方法，底层使用数组或者链表实现，自行选择，有能力可以都写
 * 实现类放在impl包下
 * 如果出现异常情况，可以使用控制台输出提示的方式解决，如果已经学了异常处理的同学可以使用异常处理
 * 不要改动接口
 * 实现完毕后，再TestList中，自行设计好测试代码，然后交给学长检查、答辩
 */
public interface MyList {

    /**
     * 获取 list 第 index 个元素
     *
     * @param index 下标
     * @return 第 index 个元素
     */
    Object get(int index);

    /**
     * 设置 list 第 index 个元素为 element
     *
     * @param index   下标
     * @param element 元素
     * @return 第 index 个元素
     */
    Object set(int index, Object element);

    /**
     * 获取 list 中是否包含某个元素o
     *
     * @param o 元素
     * @return 是否包含某个元素o
     */
    boolean contains(Object o);

    /**
     * 获取 list 是否包含数组c的所有元素
     *
     * @param c 数组
     * @return list 是否包含数组c的所有元素
     */
    boolean containsAll(Object[] c);

    /**
     * 获取 list 的元素个数
     *
     * @return list 的元素个数
     */
    int size();

    /**
     * 获取一个元素和 list 一样的数组
     *
     * @return 一个元素和 list 一样的数组
     */
    Object[] toArray();

    /**
     * 获取 list 是否为空(true)
     *
     * @return list 是否为空
     */
    boolean isEmpty();

    /**
     * 向 list 中添加一个元素
     *
     * @param e 元素
     * @return 成功返回 true 思考一下，为什么这里要boolean值？
     */
    boolean add(Object e);

    /**
     * 将 e 中所有元素添加到 list 中
     *
     * @param e 数组
     * @return 成功返回 true
     */
    boolean addAll(Object[] e);

    /**
     * 从 list 中删除第一个和  e 相等的元素
     *
     * @param e 元素
     * @return list是否发生改变
     */
    boolean remove(Object e);

    /**
     * 从 list 中删除所有与数组 e 中的元素相同的元素
     *
     * @param e 元素
     * @return list是否发生改变
     */
    boolean removeAll(Object[] e);

    /**
     * 清空 list
     */
    void clear();

    /**
     * 获取 o 在 list 中第一次出现的下标，下标从零开始
     *
     * @param o 元素
     * @return o 在 list 中第一次出现的下标
     */
    int indexOf(Object o);

    /**
     * 获取 o 在 list 中最后一次出现的下标
     *
     * @param o 元素
     * @return o 在 list 中最后一次出现的下标
     */
    int lastIndexOf(Object o);

    /**
     * 返回当前 list 与 o 是否完全相等
     *
     * @param o 元素
     * @return 当前 list 与 o 是否完全相等
     */
    @Override
    boolean equals(Object o);

    /**
     * 返回 list 中每一个元素组成的字符串
     * 如 list 中有3个整数1， 2， 3，那么返回如下
     * [1, 2, 3]
     *
     * @return list 中每一个元素组成的字符串
     */
    @Override
    String toString();

}
