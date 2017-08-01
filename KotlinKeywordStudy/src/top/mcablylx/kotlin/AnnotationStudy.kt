package top.mcablylx.kotlin

@Target(AnnotationTarget.CLASS,//类注解
        AnnotationTarget.FUNCTION,//方法注解
        AnnotationTarget.VALUE_PARAMETER,//属性注解
        AnnotationTarget.EXPRESSION//表达式注解
)
@Retention(AnnotationRetention.SOURCE)//指定该注解是否存储在编译后的 class 文件中，以及它在运行时能否通过反射可见 （默认都是 true）
@MustBeDocumented//指定该注解是公有 API 的一部分，并且应该包含在生成的 API 文档中显示的类或方法的签名中。
annotation class Mcablylx


@Mcablylx class MyClass
