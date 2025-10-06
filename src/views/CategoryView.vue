<template>
  <main class="container">
    <CategoryFormComponent v-model:category="selectCategory" @submit="handleSave" />
    <table class="table">
      <thead>
        <tr>
          <th scope="col">#</th>
          <th scope="col">Category Code</th>
          <th scope="col">Category Name</th>
          <th scope="col">Action</th>
        </tr>
      </thead>
      <tbody>
        <template v-for="(item, index) in categories" :key="item.id">
          <tr>
            <td>{{ index + 1 }}</td>
            <td>{{ item.categoryCode }}</td>
            <td>{{ item.categoryName }}</td>
            <td>
              <button type="button" class="btn btn-warning" @click="showDetail(item.id)">
                Detail
              </button>
              <button
                type="button"
                class="btn btn-danger"
                @click="handleDelete(item.id)"
                style="margin-left: 10px"
              >
                Remove
              </button>
            </td>
          </tr>
        </template>
      </tbody>
    </table>
  </main>
</template>

<script setup>
import CategoryFormComponent from '@/components/CategoryFormComponent.vue'
import {
  createCategory,
  deleteCategory,
  getCategories,
  getCategoryById,
  updateCategory,
} from '@/services/CategoryService'
import { onMounted, ref } from 'vue'

const categories = ref([])
const selectCategory = ref({})

// 📥 Gọi API lấy danh sách
const fetchCategories = async () => {
  try {
    const res = await getCategories()
    categories.value = res.data
  } catch (err) {
    console.error('Error fetching books:', err)
  }
}
// Xem chi tiết
const showDetail = async (id) => {
  try {
    const res = await getCategoryById(id)
    selectCategory.value = res.data // Lấy đúng dữ liệu cần binding
  } catch (err) {
    console.error('Error fetching detail:', err)
  }
}

const handleDelete = async (id) => {
  // alert('aaaaa' + id)
  try {
    await deleteCategory(id)
    await fetchCategories()
  } catch (err) {
    console.error('Delete error:', err)
  }
}
// Thêm / cập nhật sản phẩm
const handleSave = async (formData) => {
  console.log('aaaa')

  try {
    if (formData.id) {
      await updateCategory(formData.id, formData)
    } else {
      await createCategory(formData)
    }
    selectCategory.value = {}
    await fetchCategories()
  } catch (err) {
    console.error('Submit error:', err)
  }
}
onMounted(fetchCategories)
</script>

<style scoped></style>
