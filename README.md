# Coding Relay


## Coding Relay（コーディングリレー）とは

Coding Relay（コーディングリレー）とは、複数人で協力してプログラムを書くリレー形式のアクティビティです。
リレー競技のように、ある人が書いたコードを次の人が引き継いで開発を進めて、お題に沿ったプログラムをチームで協力して書きます。

### ルール

- リレー形式で開発
    - チームのメンバーで順番を決め、その順にプログラムを書き進める
    - 1ターンで、1人1行まで変更できる
    - 1行変更したら、次の人にバトンタッチ
    - プログラムが完成するまでバトンを繋ぐ
    - アンカーのターンでプログラムが完成しない場合は、第一走者にバトンタッチ
- 人間がコードを書く
    - AI Agentに頼らない
    - 文法を調べるのはOK
- テストケースが通り、時間・空間計算量が優れているチームが勝利
    - まずは動くものをチームで作り上げよう
    - 実装方針はチームで相談しよう


## Swift

`CodingRelay` というプロジェクトが、`/Swift` にあります。
macOS Framework として作られています。

- 各問題の概要や空の実装は `CodingRelay/` にファイルがあります。
    - ex: `FizzBuzz.swift`
    - `execute()` の中身を実装してください。
    - `fatalError("FizzBuzz.execute is unimplemented.")` は実装時に削除してください。
- 各問題のテストケースは `CodingRelayTests/` にファイルがあります。
    - ex: `FizzBuzzTests.swift`
    - Swift Testing で書かれています。
    - プログラムが完成したらテストを実行してください。
    - テストが通ったら完走です！


## Kotlin

`CodingRelay` というプロジェクトが、`/Kotlin` にあります。
プロジェクト作成時に No Activity が選択されています。

- 各問題の概要や空の実装は `/app/src/main/java/com/example/codingrelay/` にファイルがあります。
    - ex: `FizzBuzz.kt`
    - `execute()` の中身を実装してください。
    - 初期実装にある return文 は実装時に削除してください。
- 各問題のテストケースは `/app/src/test/java/com/example/codingrelay/` にファイルがあります。
    - ex: `FizzBuzzTest.kt`
    - JUnit4 で書かれています。
    - プログラムが完成したらテストを実行してください。
    - テストが通ったら完走です！

