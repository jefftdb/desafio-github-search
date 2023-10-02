package br.com.igorbag.githubsearch.domain

import com.google.firebase.database.core.Repo
import com.google.gson.annotations.SerializedName
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

data class Repository(
    val name: String,
    @SerializedName("html_url")
    val htmlUrl: String
) : Call<List<Repo>> {
    override fun clone(): Call<List<Repo>> {
        TODO("Not yet implemented")
    }

    override fun execute(): Response<List<Repo>> {
        TODO("Not yet implemented")
    }

    override fun enqueue(callback: Callback<List<Repo>>) {
        TODO("Not yet implemented")
    }

    override fun isExecuted(): Boolean {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun isCanceled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun request(): Request {
        TODO("Not yet implemented")
    }

    override fun timeout(): Timeout {
        TODO("Not yet implemented")
    }
}