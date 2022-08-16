<script>
    export default {
        props: {
            label: String
        },
        data () {
            return {
                isError: this.checkStatus('error'),
                isSuccessful: this.checkStatus('success'),
                isUpdating: this.checkStatus('updating'),
            }
        },
        methods: {
            /**
             * Return if label of current object is equal to str
             * 
             * @param {string} str 
             */
            checkStatus(str) {
                return this.label === str
            },

            /**
            * Capitalize the first letter of a string.
            * 
            * @param {string} str 
            */
            capitalizeFirst(str) {
                return str.charAt(0).toUpperCase() + str.slice(1)
            }
        }
    }
</script>

<template>
    <!-- Component to display status header (success, error, update) -->
    <button type="button"
        class="rounded-xl text-5xl font-bold" :class="{'bg-red-400': isError, 'bg-yellow-400': isUpdating, 'bg-green-400': isSuccessful}" disabled>
        <p type="text" class="text-black text-2xl bg-transparent border-none">
            {{this.capitalizeFirst(this.label)}}
        </p>
    </button>
</template>