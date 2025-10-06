<template>
  <form @submit.prevent="handleSubmit">
    <div class="mb-3">
      <label class="form-label">Category Code</label>
      <input v-model="category.categoryCode" type="text" class="form-control" required />
    </div>

    <div class="mb-3">
      <label class="form-label">Category Name</label>
      <input v-model="category.categoryName" type="text" class="form-control" required />
    </div>

    <button type="submit" class="btn btn-success">
      {{ category.id ? 'Update' : 'Add' }}
    </button>
  </form>
</template>

<script setup>
// Nhận binding từ cha
const category = defineModel('category')

// Khai báo emit sự kiện submit
const emit = defineEmits(['submit'])
const handleSubmit = () => {
  emit('submit', category.value)
}
</script>

<style scoped></style>
