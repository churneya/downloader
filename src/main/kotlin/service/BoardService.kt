package service

import client.Client

object BoardService {
    private val client: Client = Client

    fun saveThread(
        boardName: String,
        threadId: Int,
    ) {
        val threadWrapper = client.getThreadWrapper(boardName, threadId)

        threadWrapper.threads.first().posts.forEach { post ->
            post.files?.forEach { file ->
                val destination = "$boardName/$threadId/${file.name}"
                client.downloadFile(file.path, destination)
            }
        }
    }
}
