/**
 * ハンズオン3 高階関数.
 *
 * ---
 * Step1 高階関数の作成
 *
 * List<Int>を第一引数に取り、Intを受け取りBooleanを返す関数を第二引数に取る関数 filterを作成せよ
 * Hint: いきなりじゃ難しいので一緒にやりましょう
 *
 * ---
 * Step2 高階関数filterに関数を渡す
 *
 * 作成したfilterにIntを受け取りBooleanを返す関数を渡そう！
 * Hint: ここは初見じゃわからないので緒にやりましょう
 *
 * ---
 * Step3 Sugar Syntax
 *
 * Sugar Syntax(構文糖衣)をつかってKotlinらしく書いてみよう
 * Hint: 何も説明してないのでわかるわけがないので一緒にやりましょう
 *
 */
fun main(args: Array<String>) {
    val nums = mutableListOf(-2, -1, 1, 2)
    println("Negative: " + filterNegative(nums))
    println("NotNegative: " + filterNotNegative(nums))
}

// Step 1
//fun filter(nums: List<Int> /* TODO  Intを受け取りBooleanを返す関数 */ : List<Int> {
//    val list = mutableListOf<Int>()
//    for (num in nums) {
//        if (/* TODO ここに引数で受け取った関数 */) {
//            list += num
//        }
//    }
//    return list.toList()
//}

fun filterNegative(nums: List<Int>): List<Int> {
    val list = mutableListOf<Int>()
    for (n in nums) {
        if (0 > n) {
            list += n
        }
    }
    return list.toList()
}

fun filterNotNegative(nums: List<Int>): List<Int> {
    val list = mutableListOf<Int>()
    for (n in nums) {
        if (0 <= n) {
            list += n
        }
    }
    return list.toList()
}
