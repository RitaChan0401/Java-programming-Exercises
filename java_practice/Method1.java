package java_practice;

class Method1 {

    // staticメソッド・静的メソッド・クラスメソッド
    static void staticMethod1() {

        // instanceMethod(); これはダメ!　staticメソッドから、（同一クラス内の）インスタンスメソッドへの（直接の）アクセスはできない。

        Method1 a = new Method1(); // クラスのインスタンスを生成
        a.instanceMethod(); // インスタンスを介した間接的なアクセスでインスタンスメソッドにアクセスできる。
    }

    // staticメソッド・静的メソッド
    static void staticMethod1_1() {
        staticMethod1(); // 自クラス内からの呼び出しなのでクラス名はいらない。

        Method1.staticMethod1(); // これでも呼び出せる。
    }

    // インスタンスメソッド・非staticメソッド
    void instanceMethod() {
        staticMethod1(); // インスタンスメソッドからstaticメソッドの呼び出し(アクセス)もクラス名なしでok

        Method1.staticMethod1(); // これでも呼び出せる。
    }
}

// 別クラス
class Method2 {
    static void staticMethod2() {

        // staticMethod1(); これはだめ!

        Method1.staticMethod1(); // 別クラスから呼び出すときは、クラス名.staticメソッド名

        // instanceMethod(); これはダメ!

        Method1 b  = new Method1(); // 別クラスのインスタンスメソッドにアクセスする時も、インスタンスを介してインスタンスメソッドにアクセス
        b.instanceMethod();

        Method2 c = new Method2(); // 自クラス内のインスタンスメソッドへのアクセスも同じ。
        c.instanceMethod2();
    }

    void instanceMethod2() {
        Method1.staticMethod1_1(); // インスタンスメソッドから別のクラスのstaticメソッドの呼び出しの際は、クラス名が必要！
        staticMethod2();
        Method3.staticMethod3();
    }
}

class Method3 extends Method1{
    static void staticMethod3() {
        staticMethod1(); // 継承するとクラス名不要で呼び出せる

        //instanceMethod(); 継承でもこれはダメ。必ずクラスのインスタンスを生成し、それを介してアクセス

        Method1 d = new Method1();
        d.instanceMethod();
    }

    void instanceMethod3() {
        staticMethod1();
    }
}


