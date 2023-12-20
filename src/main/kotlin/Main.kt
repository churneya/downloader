import service.BoardService

fun main(args: Array<String>) {
    val boardName = args[0]
    val threadId = args[1].toInt()

    BoardService.saveThread(boardName, threadId)
}
