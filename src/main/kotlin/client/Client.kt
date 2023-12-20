package client

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.decodeFromStream
import response.ThreadResponse
import java.net.URI
import java.nio.file.Files
import java.nio.file.Paths

object Client {
    @OptIn(ExperimentalSerializationApi::class)
    fun getThreadWrapper(
        boardName: String,
        threadId: Int,
    ): ThreadResponse {
        return URI
            .create("https://2ch.hk/$boardName/res/$threadId.json")
            .toURL()
            .openStream()
            .use { inputStream ->
                Json.decodeFromStream<ThreadResponse>(inputStream)
            }
    }

    fun downloadFile(
        path: String,
        outputFileName: String,
    ) {
        URI("https://2ch.hk/$path").toURL().openStream().use {
            val paths = Paths.get(outputFileName)
            Files.createDirectories(paths.parent)
            Files.copy(it, paths)
        }
    }
}
