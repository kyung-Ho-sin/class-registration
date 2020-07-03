<template>
        <div>
            <v-breadcrumbs :items="items" large style="width:500px; margin:0px"/>
            <v-breadcrumbs :items="items" large style="width:500px; float:right;"/>
        </div>
</template>

<script>
export default {
    data() {
        return {
             items: [
                {
                    text: '대시보드',
                    disabled: false,
                    href: 'breadcrumbs_dashboard',
                },
                {
                    text: '강의목록',
                    disabled: false,
                    href: 'breadcrumbs_link_1',
                },
                {
                    text: '기술블로그',
                    disabled: false,
                    href: 'breadcrumbs_link_2',
                },
            ],
        }
    }
}
</script>

<style>
    .div {
        border : 1px solid black;
    }
    .v-breadcrumbs {
        
    }
</style>