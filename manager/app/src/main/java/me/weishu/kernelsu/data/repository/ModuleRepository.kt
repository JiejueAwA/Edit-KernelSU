package lol.nightmaple.zakusu.data.repository

import lol.nightmaple.zakusu.data.model.Module
import lol.nightmaple.zakusu.data.model.ModuleUpdateInfo

interface ModuleRepository {
    suspend fun getModules(): Result<List<Module>>
    suspend fun checkUpdate(module: Module): Result<ModuleUpdateInfo>
}
